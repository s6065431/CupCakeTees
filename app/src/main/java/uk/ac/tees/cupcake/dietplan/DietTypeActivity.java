package uk.ac.tees.cupcake.dietplan;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import uk.ac.tees.cupcake.R;
import uk.ac.tees.cupcake.adapters.DietTypeAdapter;
import uk.ac.tees.cupcake.navigation.NavigationBarActivity;

/**
 * @author Hugo Tomas <s6006225@live.tees.ac.uk>
 */
public class DietTypeActivity extends NavigationBarActivity {

    @Override
    protected int layoutResource() {
        return R.layout.activity_recycler_view;
    }

    @Override
    public void setup() {
        setupDietTypes();
        setTitle("Diet Plans");
    }


    /**
     * Description of 4 Different Diet types.
     * In a recycler view to then when clicked move to {@link DietDetailsActivity} with the selected diet type.
     */
    private void setupDietTypes() {
        RecyclerView mRecyclerView = findViewById(R.id.myRecycleView);
        ArrayList<Diet> mDiets = new ArrayList<>();

        mDiets.add(new Diet("High Calorie Diet",
                "The high-calorie diet is a type of diet in which it is comprised of food high in protein, carbohydrate, fat," +
                " vitamins and minerals. \n\nCalories: 4000-5000 per day."));


        mDiets.add(new Diet("Very Low Calorie Diet (VLCD)",
                "A diet with very or extremely low daily food energy consumption VLCDs are formulated, nutritionally complete," +
                        " liquid meals.\n\nCalories 800-1000 per day"));

        mDiets.add(new Diet("Balanced Diet", "balanced diet. A diet that contains the proper proportions of carbohydrates, fats, proteins, vitamins, minerals, and water necessary to maintain good health.\n\n" +
                "Calories: 1800-2200"));

        mDiets.add(new Diet("Vegetarian", "A well-planned vegetarian diet is a healthy way to meet your nutritional needs. " +
                "Vegetarian diets contain many health benefits such as reducing risk of heart disease and diabetes. \n\nCalories: 1800-2200"));

        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter mAdapter = new DietTypeAdapter(mDiets, getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
