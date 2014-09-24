package tests.TA2Tests.CellArray2DTests;

import static org.junit.Assert.*;

import org.junit.Test;

import caTools.CellArray2D;

public class DiagTests {
	CellArray2D test = new CellArray2D(3, 3);

	/*
	 * {{0,1,0}, {0,1,0}, {1,0,0}}
	 */
	@Test
	public void test() {
		test.resurrectCell(2, 0);
		test.resurrectCell(0, 1);
		test.resurrectCell(1, 1);

		int[] expectedr001 = {};
		int[] actualr001 = test.getRightDiag(0, 0, 1).toBinaryArray();
		assertArrayEquals(expectedr001, actualr001);

		int[] expectedl001 = { 1 };
		int[] actuall001 = test.getLeftDiag(0, 0, 1).toBinaryArray();
		assertArrayEquals(expectedl001, actuall001);

		int[] expectedl002 = { 1, 0 };
		int[] actuall002 = test.getLeftDiag(0, 0, 2).toBinaryArray();
		assertArrayEquals(expectedl002, actuall002);

		int[] expectedr111 = { 1, 0 };
		int[] actualr111 = test.getRightDiag(1, 1, 1).toBinaryArray();
		assertArrayEquals(expectedr111, actualr111);

		int[] expectedl111 = { 0, 0 };
		int[] actuall111 = test.getLeftDiag(1, 1, 1).toBinaryArray();
		assertArrayEquals(expectedl111, actuall111);

		int[] expectedl112 = { 0, 0 };
		int[] actuall112 = test.getLeftDiag(1, 1, 2).toBinaryArray();
		assertArrayEquals(expectedl112, actuall112);

		int[] expectedr112 = { 1, 0 };
		int[] actualr112 = test.getRightDiag(1, 1, 2).toBinaryArray();
		assertArrayEquals(expectedr112, actualr112);

		int[] expectedr201 = { 1 };
		int[] actualr201 = test.getRightDiag(2, 0, 1).toBinaryArray();
		assertArrayEquals(expectedr201, actualr201);

		int[] expectedr202 = { 1, 0 };
		int[] actualr202 = test.getRightDiag(2, 0, 2).toBinaryArray();
		assertArrayEquals(expectedr202, actualr202);

		int[] expectedl201 = {};
		int[] actuall201 = test.getLeftDiag(2, 0, 1).toBinaryArray();
		assertArrayEquals(expectedl201, actuall201);

		int[] expectedr021 = { 1 };
		int[] actualr021 = test.getRightDiag(0, 2, 1).toBinaryArray();
		assertArrayEquals(expectedr021, actualr021);

		int[] expectedl221 = { 1 };
		int[] actuall221 = test.getLeftDiag(2, 2, 1).toBinaryArray();
		assertArrayEquals(expectedl221, actuall221);
	}

}
