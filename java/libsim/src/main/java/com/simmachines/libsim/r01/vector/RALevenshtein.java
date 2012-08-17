package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;

import com.simmachines.libsim.enc.string.Levenshtein;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Levenshtein distance]
 * <p>
 * :: Compares the similarity between two strings based on edit operations.
 * <p>
 * [Brief Description]
 * <p>
 * The Levenshtein distance between two strings is defined as the minimum number
 * of edits needed to transform one string into the other, with the allowable
 * edit operations being insertion, deletion, or substitution of a single
 * character.
 * <p>
 * [Definition]
 * <p>
 * {@code <latex>
 * 
 * 
 * Mathematically, the Levenshtein distance between two strings <math>a,
 * b</math> is given by <math>\operatorname lev}_{a,b}(|a|,|b|)</math> where
 * 
 * :<math>\qquad\operatorname{lev}_{a,b}(i,j) = \begin{cases} 0 &, i=j=0 \\ i &,
 * j = 0 \land i > 0 \\ j &, i = 0 \land j > 0 \\ \min \begin{cases}
 * \operatorname{lev}_{a,b}(i-1,j) + 1 \\ \operatorname{lev}_{a,b}(i,j-1) + 1 \\
 * \operatorname{lev}_{a,b}(i-1,j-1) + [a_i \neq b_j] \end{cases} &, \text{
 * else} \end{cases}</math>
 * 
 * </latex> }
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on General Strings :: P.202 |
 * <p>
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Levenshtein_distance">Wikipedia
 *      Article</a>
 * 
 * @author Arnoldo J. Muller Molina
 * 
 */
public class RALevenshtein extends AbstractIntVector {
	
	/**
	 * Default constructor required by R-01
	 */
	public RALevenshtein() {

	}

	/**
	 * Copy constructor
	 * 
	 * @param An
	 *            integer vector.
	 */
	public RALevenshtein(int[] vector) {
		super(vector);
	}

	/**
	 * Parse a vector from a String
	 * 
	 * @param String
	 *            that contains an encoded version of the object.
	 */
	public RALevenshtein(String line) {
		super(line);
	}

	/**
	 * Calculates the Levenshtein distance between:
	 * 
	 * @param First
	 *            sequence of symbols.
	 * @param Second
	 *            sequence of symbols.
	 * @return The minimum number of inserts, deletes and renames required to
	 *         convert one sequence of symbols into the other.
	 */
	@Override
	public Double distance(RA<Double> other) {
		return Double.valueOf(Levenshtein.distance(super.getVector(),
				((AbstractIntVector) other).getVector()));
	}

	/**
	 * Clone must be implemented by all classes that implement RA.
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {
		return new RAL2(cloneHelper());
	}

}