package marauder.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.MotionEvent;

public class MapActivity extends ActionBarActivity 
{
	ArrayList<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	ExpandableListAdapter listAdapter;
	ZoomableRelativeLayout mZoomableRelativeLayout;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(this, new OnPinchListener());
		
		mZoomableRelativeLayout = (ZoomableRelativeLayout) findViewById(R.id.zoomableRelLayout);
		mZoomableRelativeLayout.setOnTouchListener(new OnTouchListener()
		{
            @Override
            public boolean onTouch(View v, MotionEvent event) 
            {
                scaleGestureDetector.onTouchEvent(event);
                return true;
            }
        });
		
		ExpandableListView expListView = (ExpandableListView) findViewById(R.id.lvExp);
		prepareListData();
		listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
		expListView.setAdapter(listAdapter);
		
		expListView.setOnChildClickListener(new OnChildClickListener() 
		{
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) 
            {   
            	String onOrOff = "";
                if(listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equals("Classrooms"))
                {
                	if(((ImageView)findViewById(R.id.imgClassrooms)).isShown())
                	{
                		onOrOff = "Off";
                		((ImageView)findViewById(R.id.imgClassrooms)).setVisibility(View.INVISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxunchecked);
                	}
                	else
                	{
                		onOrOff = "On";
                		((ImageView)findViewById(R.id.imgClassrooms)).setVisibility(View.VISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxchecked);
                	}
                	
                	 Toast.makeText(
                             getApplicationContext(),
                             listDataHeader.get(groupPosition)
                                     + " : "
                                     + listDataChild.get(
                                             listDataHeader.get(groupPosition)).get(
                                             childPosition) + " " + onOrOff, Toast.LENGTH_SHORT)
                             .show();
                }
                else if(listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equals("Restrooms"))
                {
                	if(((ImageView)findViewById(R.id.imgRestrooms)).isShown())
                	{
                		onOrOff = "Off";
                		((ImageView)findViewById(R.id.imgRestrooms)).setVisibility(View.INVISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxunchecked);
                	}
                	else
                	{
                		onOrOff = "On";
                		((ImageView)findViewById(R.id.imgRestrooms)).setVisibility(View.VISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxchecked);
                	}
                	
                	 Toast.makeText(
                             getApplicationContext(),
                             listDataHeader.get(groupPosition)
                                     + " : "
                                     + listDataChild.get(
                                             listDataHeader.get(groupPosition)).get(
                                             childPosition) + " " + onOrOff, Toast.LENGTH_SHORT)
                             .show();
                }
                else if(listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equals("Elevators"))
                {
                	if(((ImageView)findViewById(R.id.imgElevator)).isShown())
                	{
                		onOrOff = "Off";
                		((ImageView)findViewById(R.id.imgElevator)).setVisibility(View.INVISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxunchecked);
                	}
                	else
                	{
                		onOrOff = "On";
                		((ImageView)findViewById(R.id.imgElevator)).setVisibility(View.VISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxchecked);
                	}
                	
                	 Toast.makeText(
                             getApplicationContext(),
                             listDataHeader.get(groupPosition)
                                     + " : "
                                     + listDataChild.get(
                                             listDataHeader.get(groupPosition)).get(
                                             childPosition) + " " + onOrOff, Toast.LENGTH_SHORT)
                             .show();
                }
                else if(listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equals("Stairs"))
                {
                	if(((ImageView)findViewById(R.id.imgStairs)).isShown())
                	{
                		onOrOff = "Off";
                		((ImageView)findViewById(R.id.imgStairs)).setVisibility(View.INVISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxunchecked);
                	}
                	else
                	{
                		onOrOff = "On";
                		((ImageView)findViewById(R.id.imgStairs)).setVisibility(View.VISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxunchecked);
                	}
                	
                	 Toast.makeText(
                             getApplicationContext(),
                             listDataHeader.get(groupPosition)
                                     + " : "
                                     + listDataChild.get(
                                             listDataHeader.get(groupPosition)).get(
                                             childPosition) + " " + onOrOff, Toast.LENGTH_SHORT)
                             .show();
                }
                else if(listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equals("Transparency"))
                {
                	if(((ImageView)findViewById(R.id.imgDensity)).isShown())
                	{
                		onOrOff = "Off";
                		((ImageView)findViewById(R.id.imgDensity)).setVisibility(View.INVISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxunchecked);
                	}
                	else
                	{
                		onOrOff = "On";
                		((ImageView)findViewById(R.id.imgDensity)).setVisibility(View.VISIBLE);
                		((ImageView)v.findViewById(R.id.imgCheckbox)).setImageResource(R.drawable.checkboxchecked);
                	}
                	
                	 Toast.makeText(
                             getApplicationContext(),
                             listDataHeader.get(groupPosition)
                                     + " : "
                                     + listDataChild.get(
                                             listDataHeader.get(groupPosition)).get(
                                             childPosition) + " " + onOrOff, Toast.LENGTH_SHORT)
                             .show();
                }
                return false;
            }
        });
	}
	
	private void prepareListData() 
	{
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("Density");
        listDataHeader.add("Services");
 
        // Adding child data
        List<String> services = new ArrayList<String>();
        services.add("Restrooms");
        services.add("Classrooms");
        services.add("Elevators");
        services.add("Stairs");
 
        List<String> density = new ArrayList<String>();
        density.add("Transparency");
 
        listDataChild.put(listDataHeader.get(0), density);
        listDataChild.put(listDataHeader.get(1), services);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) 
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private class OnPinchListener extends SimpleOnScaleGestureListener 
	{
	    float startingSpan;
	    float startFocusX;
	    float startFocusY;

	    public boolean onScaleBegin(ScaleGestureDetector detector) 
	    {
	        startingSpan = detector.getCurrentSpan();
	        startFocusX = detector.getFocusX();
	        startFocusY = detector.getFocusY();
	        return true;
	    }

	    public boolean onScale(ScaleGestureDetector detector) 
	    {
	        mZoomableRelativeLayout.scale(detector.getCurrentSpan()/startingSpan, startFocusX, startFocusY);
	        return true;
	    }

	    public void onScaleEnd(ScaleGestureDetector detector)
	    {
	        mZoomableRelativeLayout.restore();
	    }
	}
}
