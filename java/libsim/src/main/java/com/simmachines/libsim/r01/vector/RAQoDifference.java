package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.QoDifference;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Qo-difference distance]
 * <p>
 * :: The Qo-difference distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.QoDifference
 * @author Jose Daniel Salazar-Vargas
 */

public class RAQoDifference extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAQoDifference(){
			
	}
	
	/**QoDifference
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAQoDifference(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAQoDifference(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAQoDifference(cloneHelper());
	}
	
	/** Calculates the Qo-difference distance between this and other RAQoDifference object
	 *  @param other RAQoDifference object
	 *  @return Qo-difference distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return QoDifference.distance(getVector(),((RAQoDifference)other).getVector());
	}

}