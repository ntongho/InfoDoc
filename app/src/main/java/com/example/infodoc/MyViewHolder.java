package com.example.infodoc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView   lecturerName;
    TextView lecturerDetails;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView= itemView.findViewById(R.id.lecturerpic);
        lecturerName=itemView.findViewById(R.id.lectName);
        lecturerDetails= itemView.findViewById(R.id.lectDetails);

    }
}
