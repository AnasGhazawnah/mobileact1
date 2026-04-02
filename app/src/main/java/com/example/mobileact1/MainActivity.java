package com.example.mobileact1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        EditText etSearch = findViewById(R.id.etSearch);
        Button btnSearch = findViewById(R.id.btnSearch);

        TireDA da = new TireDA();
        List<Tire> allTires = da.getTires();
        List<Tire> filteredTires = new ArrayList<>(allTires);

        ArrayAdapter<Tire> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, filteredTires);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Tire tire = filteredTires.get(position);
            Toast.makeText(this,
                    tire.getBrand() + " " + tire.getModel() + " | " + tire.getSize() + " | " + tire.getType(),
                    Toast.LENGTH_SHORT).show();
        });

        btnSearch.setOnClickListener(v -> {
            String query = etSearch.getText().toString().toLowerCase();

            filteredTires.clear();

            if (query.isEmpty()) {
                filteredTires.addAll(allTires);
            } else {
                for (Tire tire : allTires) {
                    if (tire.getBrand().toLowerCase().contains(query)) {
                        filteredTires.add(tire);
                    } else if (tire.getModel().toLowerCase().contains(query)) {
                        filteredTires.add(tire);
                    } else if (tire.getType().toLowerCase().contains(query)) {
                        filteredTires.add(tire);
                    }
                }
            }

            adapter.notifyDataSetChanged();
        });
    }
}