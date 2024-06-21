package com.in28minutes.FilesDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FilesWalkDemo {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = Paths.get(".");

		// Files.list(currentDirectory).forEach(System.out::println); // It will
		// list the
		// current
		// directories.

		// Files.walk(currentDirectory, 2).forEach(System.out::println); // it
		// will
		// go up
		// to 2
		// levels
		// in
		// the
		// each
		// directory

		Predicate<? super Path> predicate = path -> String.valueOf(path)
				.contains(".java");

		Files.walk(currentDirectory, 4).filter(predicate) /// It walk through
															/// the directory
															/// and search for
															/// java files.
				.forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path,
				attributes) -> String.valueOf(path).contains(".java");

		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path,
				attributes) -> attributes.isDirectory();

		Files.find(currentDirectory, 4, directoryMatcher) // It will search for
															// directory or
															// files and shows
				.forEach(System.out::println);

	}

}

// .
// ./build.properties
// ./bin
// ./META-INF
// ./.classpath
// ./.settings
// ./.project
// ./src