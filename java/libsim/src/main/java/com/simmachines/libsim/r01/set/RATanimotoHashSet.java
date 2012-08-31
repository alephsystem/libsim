package com.simmachines.libsim.r01.set;

import com.simmachines.libsim.enc.set.HashBitSet;
import com.simmachines.libsim.enc.set.Set;

public class RATanimotoHashSet<O> extends AbstractTanimoto {
	
	
	public RATanimotoHashSet(){
		super();
	}
	
	public RATanimotoHashSet(Set s){
		super(s);
	}
	
	@Override
	protected Set getNewInstance() {
		return new HashBitSet<O>();
	}
	
	public Object clone(){
		return new RATanimotoHashSet<O>(cloneHelper());
	}


}