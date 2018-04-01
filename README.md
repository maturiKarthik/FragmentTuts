# FragmentTuts
Fragmenttuts +alertdialog +Menu tuts

FRAGEMNT TUTS + RULES :
-----------------------
1.) Fragments are very usefull in designing the better UI with code reusebilit,readabilty and adaptability.

2.)The best way to use fragment is with in the framelayout.

3.) For every Fragment you should create the coresponding class which extends the Fragment class and must have it own 
    layout.
    
    Code Snippet:
    *************
    
    public class Fragment2 extends Fragment implements View.OnClickListener {

    View view; //it is mandatory to use View .
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frame2,container,false);// R.layout.frame2 is the corresponding the layout

        button = (Button) view.findViewById(R.id.frame2_button);


        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.frame2_button:
                Log.d("FRAME_1","THIS IS FRAMGEMTN_2 ");
                Toast.makeText(getActivity(),"THIS_IS_THE_FRAME_2",Toast.LENGTH_LONG).show();
                break;
        }
    }
}


4.) Now , we have to  use the Fragment Manager and Fragment Transction to toggle between Framgments.
   
   Code Snippet:
   *************
   
    FragmentManager fragmentManager = getFragmentManager();
      FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame,new Fragment2());//id of the frame layout,Object of the new Fragment
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                
                
                
  ALERT_DIALOG_TUTS:
  -------------------
     
     1.) The alert dialog will only work in the class which extends the Activity.
        (i,e) it will not work if the class doen't extend the Activity.
        
        Code Snippet:
        **************
        
         // Creating the Alert PopUP
    public void open(View view){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    
 
 MENU_TUTS:
 -----------
 
 1.) The class must extend the AppCompactActivity.
 
 2.)Override the folowing metheod:
 
  public boolean onCreateOptionsMenu(Menu menu) {

       getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }
    
    3.)Override the following method to support click action  on the menu items.z
    
      public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.coupons:
                Toast.makeText(this,"CLICK_IN_MENU",Toast.LENGTH_LONG).show();
                break;


        }
        return true;
    }
    
    4.) res=>>menu==>menu.xml which must countain the following the code snippet format.
    
    
       <?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/coupons"
        android:title="Coupons"></item>
    <item android:id="@+id/stores"
        android:title="Stores"></item>
    <item android:id="@+id/cashback"
        android:title="Cashback"></item>
    <item android:id="@+id/deals"
        android:title="Deals"></item>
</menu>



I hope this might help you .
    
    
