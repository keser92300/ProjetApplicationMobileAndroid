package nicolas.keser.convertisseurdevisesgreta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;

import java.util.ArrayList;
import java.util.List;

import static nicolas.keser.convertisseurdevisesgreta.MainActivity.resulValE;
import static nicolas.keser.convertisseurdevisesgreta.MainActivity.resultVal;

public class Graphic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic);
        AnyChartView anyChartView=findViewById(R.id.any_chart_view);

        Cartesian cartesian = AnyChart.line();

        List<DataEntry> data=new ArrayList<>();

        data.add(new ValueDataEntry("Devise Euro",resulValE));
        data.add(new ValueDataEntry("Devise Cible",resultVal));

        cartesian.data(data);

        anyChartView.setChart(cartesian);

    }
}