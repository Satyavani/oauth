package gs.spring.repository;

import org.springframework.stereotype.Repository;

public enum RepoType {
	
	USER(new UserRepoReader(), new UserRepoWriter());
	
	private IRepoReader<? extends Repository> reader;
	private IRepoWriter<? extends Repository> writer;
	
	private <T extends Repository> RepoType(IRepoReader<T> reader, IRepoWriter<T> writer) {
		
		this.reader = reader;
		this.writer = writer;
	}
	
	public IRepoReader<? extends Repository> READER() {
		return reader;
	}
	
	public IRepoWriter<? extends Repository> WRITER() {
		return writer;
	}
}
