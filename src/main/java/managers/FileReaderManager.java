package managers;

import dataProviders.ConfigFileReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {
	}

	/**
	 * Gets the instance of this class
	 * @return FileReaderManager
	 */
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 /**
	  * Initializes the configFileReader if not done, else if done returns the object of configFileReader
	  * @return ConfigFileReader
	  */
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }

}
