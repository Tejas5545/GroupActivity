package com.example.groupactivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactFragment extends Fragment {
    Context context;


    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final EditText edname=view.findViewById(R.id.fname);
        final EditText eml=view.findViewById(R.id.emls);
        final EditText mob=view.findViewById(R.id.mn);
        final EditText msgs=view.findViewById(R.id.msg);
        Button btnsub=view.findViewById(R.id.btnsend);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getContext(),"Sending function goes here!",Toast.LENGTH_SHORT).show();
                Intent i =new Intent(Intent.ACTION_SENDTO);
                i.putExtra(Intent.EXTRA_EMAIL,eml.getText().toString());
                i.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                i.putExtra(Intent.EXTRA_TEXT,msgs.getText().toString());
                i.setData(Uri.parse("mailto:tejasbhut123@gmail.com"));
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });
    }

}