/*
 spoletiner - a TRIO to Promela translator
 Copyright (C) 2006 Domenico Bianculli (bianculli@gmail.com) & Paola Spoletini (spoleti@elet.polimi.it)

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

 */
package t2p.translation;

/*******************************************************************************
 * A (sub)formula representing a term.
 * 
 * @author bianculli
 * 
 */
public class TermFormula {
	private String value;

	/***************************************************************************
	 * Builds a term given its value.
	 * 
	 * @param value
	 *            the value of the term
	 */
	public TermFormula(int value) {

		this.value = "" + value;

	}

	/***************************************************************************
	 * Buiilds a term given its value
	 * 
	 * @param value
	 *            the string value of the term
	 */
	public TermFormula(String value) {
		this.value = value;
	}

	/***************************************************************************
	 * @return a string evalutation of the term
	 */
	public String eval() {
		return this.value;
	}

}
