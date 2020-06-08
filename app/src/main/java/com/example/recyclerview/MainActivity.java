package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_View;
    private String[] items = {"tem", "tem1", "tem2", "tem3", "tem4", "tem5", "tem6", "tem7", "tem", "tem1", "tem2", "tem3", "tem4", "tem5", "tem6", "tem7", "tem", "tem1", "tem2", "tem3", "tem4", "tem5", "tem6", "tem7", "tem"};
    private String[] circleImages = {
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png",
            "https://homepages.cae.wisc.edu/~ece533/images/boat.png",
            "https://homepages.cae.wisc.edu/~ece533/images/baboon.png",
            "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png",
            "https://homepages.cae.wisc.edu/~ece533/images/boat.png",
            "https://homepages.cae.wisc.edu/~ece533/images/boat.png",
            "https://homepages.cae.wisc.edu/~ece533/images/baboon.png",
            "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png",
            "https://homepages.cae.wisc.edu/~ece533/images/baboon.png",
            "https://homepages.cae.wisc.edu/~ece533/images/boat.png",
            "https://homepages.cae.wisc.edu/~ece533/images/baboon.png",
            "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png",
            "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png"
    };
    private int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a3, R.drawable.a1, R.drawable.a2, R.drawable.a3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_View = findViewById(R.id.homeRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_View.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView
        recycler_View.setAdapter(new Adapter(this, items, images, circleImages));
    }
}
