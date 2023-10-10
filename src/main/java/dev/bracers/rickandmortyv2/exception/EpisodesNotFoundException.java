package dev.bracers.rickandmortyv2.exception;

public class EpisodesNotFoundException extends Exception {
	private static final long serialVersionUID = 4566904890895928974L;

	public EpisodesNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
