package info.kingpes.expandablecardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ExpandableCardView expandableCardView = findViewById(R.id.epcard);
        expandableCardView.setChildrenView("Demo");


        expandableCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandableCardView.isExpanded())
                    expandableCardView.collapse();
                else expandableCardView.expand();
            }
        });


    }
}
