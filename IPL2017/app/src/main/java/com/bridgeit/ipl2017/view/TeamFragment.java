package com.bridgeit.ipl2017.view;

import android.app.ProgressDialog;
import android.content.Intent;
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
<<<<<<< HEAD
=======
import android.widget.PopupMenu;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
import android.widget.Toast;

import com.bridgeit.ipl2017.MainActivity;
import com.bridgeit.ipl2017.R;
import com.bridgeit.ipl2017.adapter.TeamAdapter;
import com.bridgeit.ipl2017.intrface.ArrayListTeam;
import com.bridgeit.ipl2017.model.TeamInfoModel;
import com.bridgeit.ipl2017.viewModel.TeamViewModel;

import java.util.ArrayList;
<<<<<<< HEAD

=======
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
/*
* Auth : Sonawane Gokul R.
* Date : 30/1/2017
* Disc : it contain  Recycler View of Team
*/
public class TeamFragment extends Fragment {
    public static final String TAG = "TeamFragment";
<<<<<<< HEAD
    private static FloatingActionButton mButtonLogout;
    ProgressDialog mDialog;
    private ArrayList<TeamInfoModel> mTeamInfoModels = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private OnFragmentInteractionListener mListener;

=======
    ProgressDialog mDialog;
    private  ArrayList<TeamInfoModel> mTeamInfoModels =new ArrayList<>();
    private RecyclerView mRecyclerView;

    private OnFragmentInteractionListener mListener;
    private  static Button mButtonLogout;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    public TeamFragment(ProgressDialog mDialog) {
        this.mDialog = mDialog;             //Main Activit Process Dialog
    }

<<<<<<< HEAD
    public TeamFragment() {
    }

    public static TeamFragment newInstance( ) {

        Bundle args = new Bundle();
=======
    public static TeamFragment newInstance(Button buttonpass) {
        
        Bundle args = new Bundle();
        mButtonLogout=buttonpass;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        TeamFragment fragment = new TeamFragment();
        fragment.setArguments(args);
        return fragment;
    }
<<<<<<< HEAD
=======
    public TeamFragment() {
    }

>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_team, container, false);
<<<<<<< HEAD
        mRecyclerView = (RecyclerView) view.findViewById(R.id.team_recycler);

        mButtonLogout = (FloatingActionButton) view.findViewById(R.id.mFabLogout);
=======
        mRecyclerView = (RecyclerView)view.findViewById(R.id.team_recycler);
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a

        mButtonLogout.setVisibility(View.VISIBLE);
        showProgress();
        //Load All Team Data From Firbase json file
<<<<<<< HEAD
        TeamViewModel teamViewModel = new TeamViewModel(getActivity());
        teamViewModel.getTeamData(new ArrayListTeam() {
            @Override
            public void fireBaseData(ArrayList<TeamInfoModel> teamInfos) {
=======
        TeamViewModel teamViewModel=new TeamViewModel(getActivity());
        teamViewModel.getTeamData(new ArrayListTeam()
        {
            @Override
            public void fireBaseData(ArrayList<TeamInfoModel> teamInfos)
            {
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a

                mTeamInfoModels = teamInfos;
                final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                // Atach cards to Recycler View with data
                TeamAdapter adapter = new TeamAdapter(mTeamInfoModels, getActivity());
                mDialog.dismiss();      //Dismiss Progress Dialog
                mRecyclerView.setLayoutManager(layoutManager);
                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                mRecyclerView.setAdapter(adapter);

<<<<<<< HEAD
                mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                    GestureDetector gestureDetector = new GestureDetector(getActivity(), new GestureDetector.SimpleOnGestureListener() {

                        @Override
                        public boolean onSingleTapUp(MotionEvent e) {
=======
                mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener()
                {
                    GestureDetector gestureDetector = new GestureDetector(getActivity(), new GestureDetector.SimpleOnGestureListener() {

                        @Override public boolean onSingleTapUp(MotionEvent e) {
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
                            return true;
                        }

                    });
<<<<<<< HEAD

=======
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
                    @Override
                    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                        View child = rv.findChildViewUnder(e.getX(), e.getY());
<<<<<<< HEAD
                        if (child != null && gestureDetector.onTouchEvent(e)) {
=======
                        if(child != null && gestureDetector.onTouchEvent(e)) {
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
                            int position = rv.getChildAdapterPosition(child);

                            showProgress(); //close Progress dialog
                            // After click on Team Card Replace the  Team Fragment to Player Fragment
<<<<<<< HEAD
                            //  getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain,new PlayerFragment(mTeamInfoModels.get(position).getTeamname().toString(),mDialog)).addToBackStack(null).commit();
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameload, PlayerFragment.newInstance(mTeamInfoModels.get(position).getTeamname().toString(), mDialog)).addToBackStack(null).commit();
                            Toast.makeText(getActivity(), mTeamInfoModels.get(position).getTeamname() + "...", Toast.LENGTH_SHORT).show();
=======
                          //  getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain,new PlayerFragment(mTeamInfoModels.get(position).getTeamname().toString(),mDialog)).addToBackStack(null).commit();
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameload,PlayerFragment.newInstance(mTeamInfoModels.get(position).getTeamname().toString(),mDialog,mButtonLogout)).addToBackStack(null).commit();
                            Toast.makeText(getActivity(), mTeamInfoModels.get(position).getTeamname()+"...",Toast.LENGTH_SHORT).show();
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
                        }

                        return false;
                    }
<<<<<<< HEAD

=======
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
                    @Override
                    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

                    }

                    @Override
                    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

                    }
                });
            }

        });

        mButtonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                //eamFragment.this.getActivity().finish();
                //  getActivity(). getSupportFragmentManager().beginTransaction().replace(R.id.framemain, LoginFragment.newInstance(),LoginFragment.TAG).commit();
                Intent intent = new Intent(getActivity().getApplicationContext(), MainActivity.class);
=======
               //eamFragment.this.getActivity().finish();
            //  getActivity(). getSupportFragmentManager().beginTransaction().replace(R.id.framemain, LoginFragment.newInstance(),LoginFragment.TAG).commit();
                Intent intent =new Intent(getActivity().getApplicationContext(), MainActivity.class);
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
                getActivity().startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }

    public void showProgress() {
        //Process Dialog Creation
<<<<<<< HEAD
        mDialog = new ProgressDialog(getActivity());
=======
        mDialog  = new ProgressDialog(getActivity());
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        mDialog.setMessage("Downloading Data please wait");
        mDialog.setCancelable(false);
        mDialog.show();
    }
<<<<<<< HEAD

=======
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
