package com.bridgeit.ipl2017.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
<<<<<<< HEAD
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bridgeit.ipl2017.MainActivity;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
import com.bridgeit.ipl2017.R;
import com.bridgeit.ipl2017.intrface.LoginInteface;
import com.bridgeit.ipl2017.viewModel.LoginViewModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Auth : Sonawane Gokul R.
* Date : 18/1/2017
* Disc : it contains  E-Mail And Password Validation for User Login
*/
<<<<<<< HEAD
public class LoginFragment extends Fragment {

    public static final String TAG = "LoginFragment";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private boolean mFlag = false;
    private String mStrEmail, mStrPass;
    private String mStrUser = "";
    private ProgressDialog mDialog;
    private EditText mEditTexEmail;
    private EditText mEditTextPass;
    private Button mButtonLogin, mButtonRegister;
=======
public class LoginFragment extends Fragment
{

    public static final String TAG = "LoginFragment";
    private static final String EMAIL_PATTERN ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private boolean mFlag =false;
    private   String mStrEmail, mStrPass;
    private  String mStrUser="";
    private ProgressDialog mDialog;
    private  EditText mEditTexEmail;
    private EditText mEditTextPass;
    private  Button mButtonLogin, mButtonRegister;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    private Pattern mPattern;
    private Matcher mMatcher;


    public LoginFragment() {

    }

    public static LoginFragment newInstance() {
        Bundle args = new Bundle();
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_login, container, false);

        mEditTexEmail = (EditText) v.findViewById(R.id.edittext_login_email);
        mEditTextPass = (EditText) v.findViewById(R.id.editview_login_Pass);

        Log.i("namne", "onCreateView: " + mStrEmail + "..." + mStrPass);

        mButtonLogin = (Button) v.findViewById(R.id.button_Login);
        mButtonRegister = (Button) v.findViewById(R.id.button_login_registration);
        mPattern = Pattern.compile(EMAIL_PATTERN);   // Pattern Matcher For Email Validation
<<<<<<< HEAD


        mEditTextPass.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    mEditTextPass.setFocusable(false);
                    doAuthentication();
                    return true;
                }
                return false;
            }
        });


=======
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
      /*  if (!mStrUser.equals("")) {

            Intent intent = new Intent(getActivity().getApplicationContext(), IPLLoad.class);
            getActivity().startActivity(intent);
            getActivity().finish();

        } else {
*/
<<<<<<< HEAD
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doAuthentication();
            }
        });

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain, Registration.newInstance(), Registration.TAG).addToBackStack(null).commit();

            }
        });
        //}
        return v;

    }

    public void showProgress() {
        mDialog = new ProgressDialog(getActivity());
=======
            mButtonLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mStrEmail = mEditTexEmail.getText().toString();
                    mStrPass = mEditTextPass.getText().toString();

                    if (!(mStrEmail.equals("") && mStrPass.equals(""))) {
                        mMatcher = mPattern.matcher(mStrEmail);
                        if (mMatcher.matches()) {
                            showProgress();
                            LoginViewModel viewModel = new LoginViewModel(getActivity());
                            viewModel.getLogin(mStrEmail, mStrPass, new LoginInteface() {

                                @Override
                                public void fireBaseLogin(Boolean isLogin) {

                                    if (isLogin) {
                                        mStrUser = mStrEmail;
                                        mDialog.dismiss();
                                        //After Successful Login Load TeamModel
                                        //    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain,TeamFragment.newInstance(mButtonpass),TeamFragment.TAG).commit();

                                        Intent intent = new Intent(getActivity().getApplicationContext(), IPLLoad.class);
                                        getActivity().startActivity(intent);
                                        getActivity().finish();
                                        Toast.makeText(getActivity().getApplicationContext(), "Login Success  ", Toast.LENGTH_SHORT).show();

                                    } else {
                                        mDialog.dismiss();
                                        //if Login not Successful Then Clear All Field.
                                        Toast.makeText(getActivity().getApplicationContext(), "Do Not Match User Name And Password ...", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                            mEditTexEmail.setText("");
                            mEditTextPass.setText("");
                        } else {
                            Toast.makeText(getActivity().getApplicationContext(), "Please Enter Valid Email ...", Toast.LENGTH_SHORT).show();

                        }
                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Please Enter The User Name  And Password ... ", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            mButtonRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain, Registration.newInstance(), Registration.TAG).addToBackStack(null).commit();

                }
            });
        //}
            return v;

    }
    public void showProgress() {
        mDialog  = new ProgressDialog(getActivity());
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        mDialog.setMessage("Authenticating User...");
        mDialog.setCancelable(false);
        mDialog.show();
    }
<<<<<<< HEAD

    private void doAuthentication() {
        mStrEmail = mEditTexEmail.getText().toString();
        mStrPass = mEditTextPass.getText().toString();

        if (!(mStrEmail.equals("") && mStrPass.equals(""))) {
            mMatcher = mPattern.matcher(mStrEmail);
            if (mMatcher.matches()) {
                hideKeyboard();
                showProgress();
                LoginViewModel viewModel = new LoginViewModel(getActivity());
                viewModel.getLogin(mStrEmail, mStrPass, new LoginInteface() {

                    @Override
                    public void fireBaseLogin(Boolean isLogin) {

                        if (isLogin) {
                            mStrUser = mStrEmail;
                            mDialog.dismiss();
                            //After Successful Login Load TeamModel
                            //    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framemain,TeamFragment.newInstance(mButtonpass),TeamFragment.TAG).commit();

                            Intent intent = new Intent(getActivity().getApplicationContext(), IPLLoad.class);
                            getActivity().startActivity(intent);
                            getActivity().finish();
                            Toast.makeText(getActivity().getApplicationContext(), "Login Success  ", Toast.LENGTH_SHORT).show();

                        } else {
                            mDialog.dismiss();
                            //if Login not Successful Then Clear All Field.
                            Toast.makeText(getActivity().getApplicationContext(), "Do Not Match User Name And Password ...", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                mEditTexEmail.setText("");
                mEditTextPass.setText("");
            } else {
                Toast.makeText(getActivity().getApplicationContext(), "Please Enter Valid Email ...", Toast.LENGTH_SHORT).show();

            }
        } else {
            Toast.makeText(getActivity().getApplicationContext(), "Please Enter The User Name  And Password ... ", Toast.LENGTH_SHORT).show();
        }
    }
    void hideKeyboard(){
        View view = getActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
=======
    public  void createMenu(){



>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    }
}
