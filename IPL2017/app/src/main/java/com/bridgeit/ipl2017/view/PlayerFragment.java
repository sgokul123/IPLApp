package com.bridgeit.ipl2017.view;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.design.widget.FloatingActionButton;
=======
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.bridgeit.ipl2017.R;
import com.bridgeit.ipl2017.adapter.PlayerAdapter;
import com.bridgeit.ipl2017.intrface.ArrayListPlayer;
import com.bridgeit.ipl2017.model.PlayerInfoModel;
import com.bridgeit.ipl2017.utility.Debug;
import com.bridgeit.ipl2017.viewModel.PlayerViewModel;

import java.util.ArrayList;
/*
* Auth : Sonawane Gokul R.
* Date : 30/1/2017
* Disc : It contain  Recycler View of Players
*/
public class PlayerFragment extends Fragment {
    public static final String TAG = "PlayerFragment";

    private ArrayList<PlayerInfoModel> mPlayerInfoModels =new ArrayList<>();
    private static String mTeamName;
    static ProgressDialog mDialog;
    private RecyclerView mRecyclerView;
<<<<<<< HEAD
=======
    private static Button mButtonBack;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    private TeamFragment.OnFragmentInteractionListener mListener;

    public PlayerFragment(ProgressDialog mDialog) {

        this.mDialog = mDialog;

    }

  /*  public PlayerFragment(String teamName,ProgressDialog mDialog) {
            this.mTeamName =teamName;  //TeamName for Refference if Team to fetch data
            this.mDialog=mDialog;   //Progress Dialog instance For Dismiss after data fetch.
    }
*/
<<<<<<< HEAD
    public static PlayerFragment newInstance(String teamName, ProgressDialog dialog ) {
=======
    public static PlayerFragment newInstance(String teamName, ProgressDialog dialog, Button backButton) {
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a

        Bundle args = new Bundle();
        mDialog=dialog;
        mTeamName=teamName;
<<<<<<< HEAD
=======
        mButtonBack=backButton;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        PlayerFragment fragment = new PlayerFragment(dialog);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_player, container, false);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.player_recycler);
        //Download Player data Form Firebase.
        PlayerViewModel playerViewModel=new PlayerViewModel(getActivity());
<<<<<<< HEAD
=======
        mButtonBack.setVisibility(View.INVISIBLE);
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        playerViewModel.getPlayerData(mTeamName,new ArrayListPlayer()
        {
            @Override
            public void fireBaseData(ArrayList<PlayerInfoModel> playerInfo)
            {
                mPlayerInfoModels = playerInfo;
                final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                //load data with RecyclerView
                PlayerAdapter adapter = new PlayerAdapter(mPlayerInfoModels, getActivity(),mDialog);

                  // mDialog.dismiss();
                mRecyclerView.setLayoutManager(layoutManager);
                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                mRecyclerView.setAdapter(adapter);

                //assign  Listener to RecyclerView
                mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                    GestureDetector gestureDetector = new GestureDetector(getActivity(), new GestureDetector.SimpleOnGestureListener() {

                        @Override public boolean onSingleTapUp(MotionEvent e) {
                            return true;
                        }

                    });
                    @Override
                    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                        View child = rv.findChildViewUnder(e.getX(), e.getY());
                        if(child != null && gestureDetector.onTouchEvent(e)) {
                            int position = rv.getChildAdapterPosition(child);
                          //  getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain,new PlayerFragment()).commit();
                            Toast.makeText(getActivity(), mPlayerInfoModels.get(position).getPlayer_name()+"...",Toast.LENGTH_SHORT).show();
                        }

                        return false;
                    }

                    @Override
                    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

                    }

                    @Override
                    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

                    }
                });
                Debug.showLog(TAG,"get data return..");

            }

        });


        return view;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
