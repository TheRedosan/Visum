package nest.com.visum.Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import nest.com.visum.Pruebas.VistaPrueba;

public class AdaptadorViewPager extends FragmentStatePagerAdapter {


    public AdaptadorViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        //Añadir aquí el resto de fragmentos.
        switch (position){
            default:
                return VistaPrueba.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

}