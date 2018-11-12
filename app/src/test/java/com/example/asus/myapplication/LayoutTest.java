package com.example.asus.myapplication;

import android.text.InputType;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LayoutTest {
    private MainActivity activity;
    @Before
    public void initTest() {
        activity = Robolectric.buildActivity(MainActivity.class).create().get(); }
    @Test
    public void layoutTest(){
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName(); //Method
        String compName = "mainLayout";
        int compId = activity.getResources().getIdentifier(compName, "id", activity.getPackageName());
        LinearLayout component = (LinearLayout) activity.findViewById(compId);
        assertNotNull(compName + " not yet defined", component);
        assertEquals(methodName + " - " + "Layout width is not suitable", ViewGroup.LayoutParams.MATCH_PARENT ,component.getLayoutParams().width); //Match Parent
        assertEquals(methodName + " - " + "Layout height is not suitable", ViewGroup.LayoutParams.MATCH_PARENT ,component.getLayoutParams().height); //Match Parent
        assertEquals(methodName + " - " + "Layout orientation is not suitable",LinearLayout.VERTICAL ,component.getOrientation());
    }
    @Test
    public void inputTextTest(){

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName(); //Method
        String compName = "inputText";
        int compId = activity.getResources().getIdentifier(compName, "id", activity.getPackageName());
        EditText component = (EditText) activity.findViewById(compId);
        assertNotNull(compName + " not yet defined", component);
        assertEquals(methodName + " - " + "Layout width is not suitable", ViewGroup.LayoutParams.MATCH_PARENT ,component.getLayoutParams().width); //Match Parent
        assertEquals(methodName + " - " + "Layout height is not suitable", ViewGroup.LayoutParams.WRAP_CONTENT ,component.getLayoutParams().height); //Match Parent
        assertEquals(methodName + " - " + "Input type is not suitable", InputType.TYPE_CLASS_NUMBER, component.getInputType());
        assertEquals(methodName + " - " + "Component text is not suitable","0",component.getText().toString());
    }
    @Test
    public void resultTextTest(){

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName(); //Method
        String compName = "resultText";
        int compId = activity.getResources().getIdentifier(compName, "id", activity.getPackageName());
        TextView component = (TextView) activity.findViewById(compId);

        assertNotNull(compName + " not yet defined", component);
        assertEquals(methodName + " - " + "Layout width is not suitable", ViewGroup.LayoutParams.MATCH_PARENT ,component.getLayoutParams().width); //Match Parent
        assertEquals(methodName + " - " + "Layout height is not suitable",100 ,component.getLayoutParams().height); //Match Parent
        assertEquals(methodName + " - " + "Component text is not suitable","",component.getText().toString());
    }
    @Test
    public void farenheitButtonTest(){

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName(); //Method
        String compName = "farenheitBtn";
        int compId = activity.getResources().getIdentifier(compName, "id", activity.getPackageName());
        Button component = (Button) activity.findViewById(R.id.farenheitBtn);
        assertNotNull(compName + " not yet defined", component);
        assertEquals(methodName + " - " + "Layout width is not suitable", ViewGroup.LayoutParams.MATCH_PARENT ,component.getLayoutParams().width); //Match Parent
        assertEquals(methodName + " - " + "Layout height is not suitable",60 ,component.getLayoutParams().height); //Match Parent
        assertEquals(methodName + " - " + "Component text is not suitable","Get Farenheit",component.getText().toString());
    }
    @Test
    public void kelvinButtonTest(){
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName(); //Method
        String compName = "kelvinBtn";
        int compId = activity.getResources().getIdentifier(compName, "id", activity.getPackageName());
        Button component = (Button) activity.findViewById(R.id.farenheitBtn);
        assertNotNull(compName + " not yet defined", component);
        assertEquals(methodName + " - " + "Layout width is not suitable", ViewGroup.LayoutParams.MATCH_PARENT ,component.getLayoutParams().width); //Match Parent
        assertEquals(methodName + " - " + "Layout height is not suitable",60 ,component.getLayoutParams().height); //Match Parent
        assertEquals(methodName + " - " + "Component text is not suitable","Get Farenheit",component.getText().toString());
    }

}


