package com.oop;

public class ODIMatch extends Match{
	
	@Override
	public int calculateBalls() {
	       return (int)(50*6 - this.getCurrentOver()*6);
	    }
	
	@Override
	 public float calculateRunrate()
	  {
	      int score = this.getTargetScore() - this.getCurrentScore();
	      int over = (int)(50 - this.getCurrentOver());
	      return (float)score/over;
	  };
	}