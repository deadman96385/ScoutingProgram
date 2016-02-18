package falconrobotics.scoutingprogram;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by
 *          Francisco Martinez
 *          >> <<
 *
 *          on 2/7/2016.
 * DESCRIPTION: This fragment displays email fragment and will enable the user to send
 *              certain files such as for outside of the app analyzing through email.
 */
public class Fragment_Email extends Fragment {
    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_email,null);


        return rootView;
    }
}
