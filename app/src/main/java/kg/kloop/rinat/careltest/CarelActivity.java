package kg.kloop.rinat.careltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CarelActivity extends AppCompatActivity {

    private Carel carel;
    private TextView textView;
    private CarelGrid grid;
    private GameCanvas canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTextView((TextView)findViewById(R.id.textView));
        grid = new CarelGrid();
        canvas = new GameCanvas(textView);
        carel = new Carel(canvas, grid);
    }

    protected void move(){
        carel.move();
    }

    protected void turnLeft() {
        carel.turnLeft();
    }

    protected void pickBeeper() {
        carel.collectBeeper();
    }

    protected void putBeeper() {
        carel.dropBeeper();
    }

    protected boolean isFrontClear() {
        return carel.isFrontClear();
    }

    protected boolean isBeeperPresent() {
        return carel.isBeeper();
    }

    protected void setTextView(TextView textView){
        this.textView = textView;
    }

    protected void setGrid (int[][] map){
        grid.setGrid(map);
    }
}
