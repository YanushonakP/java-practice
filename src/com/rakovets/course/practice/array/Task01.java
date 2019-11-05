package com.rakovets.course.practice.array;

import com.rakovets.course.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками только по одному предмету
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		int countMarks = INPUT_SCANNER.nextInt();
		int[] marks = nextArray(countMarks);
		// Вызов методов
		getAverageMark(marks);
		getMinMark(marks);
		getMaxMark(marks);
	}

	/**
	 * Возвращает средне арифметическую отметку с округлением до 2 знаков.
	 * @param marks отметки
	 * @return средняя арифметическая отметка
	 */
	static double getAverageMark(int[] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double averageMark = 0;
		for (int i = 0; i < marks.length; i++){
			averageMark = averageMark + marks[i];
		}
		return Math.round((averageMark/marks.length)*100)/100.0;
	}

	/**
	 * Возвращает минимальную отметку.
	 * @param marks отметки
	 * @return минимальная отметка
	 */
	static int getMinMark(int[] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		Arrays.sort(marks);
		int i = marks[0];
		return i;
	}

	/**
	 * Возвращает максимальну отметку.
	 * @param marks отметки
	 * @return максимальная отметка
	 */
	static int getMaxMark(int[] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		Arrays.sort(marks);
		int i = marks[(marks.length)-1];
		return i;
	}

	private static int[] nextArray(int countMarks) {
		int[] marks = new int[countMarks];
		for (int i = 0; i < countMarks; i++) {
			marks[i] = INPUT_SCANNER.nextInt();
		}
		return marks;
	}
}