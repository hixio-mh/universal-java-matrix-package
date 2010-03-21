/*
 * Copyright (C) 2008-2010 by Holger Arndt
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

package org.ujmp.sst;

import org.junit.Test;
import org.ujmp.core.Matrix;
import org.ujmp.core.exceptions.MatrixException;
import org.ujmp.core.implementations.AbstractMatrixTest;

public class TestSSTDenseDoubleMatrix extends AbstractMatrixTest {

	public Matrix createMatrix(long... size) throws MatrixException {
		return new SSTDenseDoubleMatrix2D(size);
	}

	public Matrix createMatrix(Matrix source) throws MatrixException {
		return new SSTDenseDoubleMatrix2D(source);
	}

	@Override
	@Test(timeout = 1000)
	public void testAnnotation() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testAnnotation();
	}

	@Override
	@Test(timeout = 1000)
	public void testAvailableCoordinateIterator2D() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testAvailableCoordinateIterator2D();
	}

	@Override
	@Test(timeout = 1000)
	public void testClone() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testClone();
	}

	@Override
	@Test(timeout = 1000)
	public void testContains() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testContains();
	}

	@Override
	@Test(timeout = 1000)
	public void testCoordinateIterator2D() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testCoordinateIterator2D();
	}

	@Override
	@Test(timeout = 1000)
	public void testCountMissingValues() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testCountMissingValues();
	}

	@Override
	@Test(timeout = 1000)
	public void testEmpty() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testEmpty();
	}

	@Override
	@Test(timeout = 1000)
	public void testGetCoordinatesOfMaximum() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testGetCoordinatesOfMaximum();
	}

	@Override
	@Test(timeout = 1000)
	public void testGetCoordinatesOfMininim() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testGetCoordinatesOfMininim();
	}

	@Override
	@Test(timeout = 1000)
	public void testGinvSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testGinvSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testInvSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testInvSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testMinusScalarSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testMinusScalarSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testMTimesSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testMTimesSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testPlusScalarSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testPlusScalarSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testSelectedCoordinates() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testSelectedCoordinates();
	}

	@Override
	@Test(timeout = 1000)
	public void testSelectedCoordinatesString() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testSelectedCoordinatesString();
	}

	@Override
	@Test(timeout = 1000)
	public void testSerialize() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testSerialize();
	}

	@Override
	@Test(timeout = 1000)
	public void testSetAndGet() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testSetAndGet();
	}

	@Override
	@Test(timeout = 1000)
	public void testSize() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testSize();
	}

	@Override
	@Test(timeout = 1000)
	public void testToDoubleArray() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testToDoubleArray();
	}

	@Override
	@Test(timeout = 1000)
	public void testTransposeSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testTransposeSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testPinvSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testPinvSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testSVDFatSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testSVDFatSmall();
	}

	@Override
	@Test(timeout = 1000)
	public void testQRSquareSmall() throws Exception {
		// SST requires Java 1.6, it cannot be tested with 1.5
		if ("1.5".equals(System.getProperty("java.specification.version"))) {
			return;
		}
		super.testQRSquareSmall();
	}

	public boolean isTestLarge() {
		return false;
	}
}
