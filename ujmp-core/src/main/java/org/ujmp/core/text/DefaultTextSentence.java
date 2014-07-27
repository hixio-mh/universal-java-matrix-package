/*
 * Copyright (C) 2008-2014 by Holger Arndt
 *
 * This file is part of the Universal Java Matrix Package (UJMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * UJMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * UJMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with UJMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.ujmp.core.text;

import org.ujmp.core.listmatrix.DefaultListMatrix;

public class DefaultTextSentence extends DefaultListMatrix<DefaultTextToken> {
	private static final long serialVersionUID = -1411406267646623488L;

	public String toJson() {
		StringBuilder sb = new StringBuilder();
		sb.append("  {\n");
		sb.append("    \"Type\": \"Sentence\",\n");
		sb.append("    \"Id\": ");
		sb.append("\"");
		sb.append(getMetaData("Id"));
		sb.append("\",\n");
		sb.append("    \"Tokens\":\n");
		sb.append("    [\n");
		int i = 0;
		for (DefaultTextToken token : this) {
			sb.append(token.toJson());
			if (i++ < size() - 1) {
				sb.append(",\n");
			}
		}
		sb.append("\n    ]\n");
		sb.append("  }");
		return sb.toString();
	}

}
