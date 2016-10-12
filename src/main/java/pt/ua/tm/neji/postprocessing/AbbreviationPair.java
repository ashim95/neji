/*
 * Copyright (c) 2016 BMD Software and University of Aveiro.
 *
 * Neji is a flexible and powerful platform for biomedical information extraction from text.
 *
 * This project is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/.
 *
 * This project is a free software, you are free to copy, distribute, change and transmit it.
 * However, you may not use it for commercial purposes.
 *
 * It is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

package pt.ua.tm.neji.postprocessing;

/**
 * @author Ariel Schwartz
 * @version 03/12/03
 */
class AbbreviationPair {

    String shortForm, longForm;

    public AbbreviationPair(final String shortForm, final String longForm) {
        this.longForm = longForm;
        this.shortForm = shortForm;
    }

    @Override
    public String toString() {
        return shortForm + "\t" + longForm;
    }
}
