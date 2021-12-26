package com.example.quotesapp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class QuoteViewHolder extends RecyclerView.ViewHolder {

    TextView textView_quote, textView_author;
    Button button_copy;

    public QuoteViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_quote = itemView.findViewById(R.id.textView_quote);
        textView_author = itemView.findViewById(R.id.textView_author);
        button_copy = itemView.findViewById(R.id.button_copy);

    }
}
