package com.example.infodoc;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends AppCompatActivity {

    RecyclerView recyclerView;
    EditText inputSearch;
    FirebaseRecyclerOptions<LecturerDb> options;
    FirebaseRecyclerAdapter<LecturerDb, MyViewHolder> adapter;
    DatabaseReference DataRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer);

        DataRef=FirebaseDatabase.getInstance().getReference().child("LecturerDb");

        recyclerView = findViewById(R.id.recyclerView);
        inputSearch=findViewById(R.id.search);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);



    LoadData("");
    inputSearch.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString()!=null){
                LoadData(s.toString());
            }else
            {
                LoadData("");
            }

        }
    });



    }

    private void LoadData(String data) {
        Query query=DataRef.orderByChild("LecturerName").startAt(data).endAt(data+"\uf8ff");

        //=========================

        //========================

        options=new FirebaseRecyclerOptions.Builder<LecturerDb>().setQuery(query,LecturerDb.class).build();
        adapter=new FirebaseRecyclerAdapter<LecturerDb, MyViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull LecturerDb model) {
                holder.lecturerName.setText(model.getLecturerName());
                holder.lecturerDetails.setText(model.getLecturerDetails());
                Picasso.get().load(model.getImageUrl()).into(holder.imageView);

            }

            @NonNull
            @Override
            public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.lecturer_cardview,parent,false);
                return new MyViewHolder(v);
            }
        };

        adapter.startListening();
        recyclerView.setAdapter(adapter);
    }

}



