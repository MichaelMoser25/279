package week12Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



public class ShuffleList<T> extends ArrayList<T> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ShuffleList() {}
	
	public void shuffle() 
	{
		Random rdm = new Random() ;
		
		int nIterations = this.size() ;
		for (int i=0; i<nIterations; i++)
		{
			int j = rdm.nextInt(this.size()) ;
			int k = rdm.nextInt(this.size()) ;
			T tmp = this.get(i) ;
			this.set(i, this.get(j)) ;
			this.set(j,tmp) ;
		}
	}
	
	public static void main(String args[])
	{
		
		ShuffleList<Integer> sList = new ShuffleList<>() ;
		
		for (int i=0; i<10; i++) {
			sList.add(i) ;
		}
//		sList.add(1) ;
//		sList.add(34) ;
//		sList.add(101) ;
		
		Iterator<Integer> itr = sList.iterator() ;
		
		System.out.println("before shuffling ...\n") ;
		while(itr.hasNext())
		{
			System.out.println(itr.next()) ;
		}
		
		
		System.out.println("\n\nafter shuffling ...\n") ;
		itr = sList.iterator() ;
		sList.shuffle();
		while(itr.hasNext())
		{
			itr = sList.iterator() ;
			System.out.println(itr.next()) ;
		}

		
	}

}
