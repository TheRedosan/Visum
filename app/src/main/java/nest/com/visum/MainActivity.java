package nest.com.visum;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.github.florent37.bubbletab.BubbleTab;

import butterknife.BindView;
import butterknife.ButterKnife;
import nest.com.visum.Adaptadores.AdaptadorViewPager;

public class MainActivity extends AppCompatActivity {

    //Usado para cargar las librerías externas.
//    static {
//        System.loadLibrary("native-lib");
//    }

    @BindView(R.id.bubbleTab) BubbleTab bubbleTab;
    @BindView(R.id.viewPager) ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Elimina el título de la APP en la ventana principal
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);

        viewPager.setAdapter(new AdaptadorViewPager(getSupportFragmentManager()));
        bubbleTab.setupWithViewPager(viewPager);

    }

}
