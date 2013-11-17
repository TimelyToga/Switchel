package com.example.switchel;

import android.content.Context;
import android.widget.Toast;


public class Count {

	public Count(){
	}
	
	
	public int count(int call){
		int score = 0;
		
		switch(call){
		case 1: score = score + 1;
			break;
		case 2: score = score % 10;
			break;
		case 10: score = score + 10;
			break;
		case 1000: score = score + 1000;
		 	break;
		}
		
		return score;
	}
}
