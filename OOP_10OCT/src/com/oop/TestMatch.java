package com.oop;

public class TestMatch extends Match{
	
	@Override
	public int calculateBalls() {
       return (int)(90*6 - this.getCurrentOver()*6);
    }
	
	@Override
	public float calculateRunrate()
  {
      int score = this.getTargetScore() - this.getCurrentScore();
      int over = (int)(90 - this.getCurrentOver());
      return (float)score/over;
  };
 
}