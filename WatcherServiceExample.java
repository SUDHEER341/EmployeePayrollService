package com.payrollservice;
import java.nio.file.*;

public class WatcherServiceExample
{
    public static void main(String[] args) throws Exception
    {
        // Get the path to the directory to be watched
        Path directoryPath = Paths.get("/path/to/directory");

        // Get the watcher service for the default file system
        WatchService watcherService = FileSystems.getDefault().newWatchService();

        // Register the directory with the watcher service to monitor for events
        directoryPath.register(watcherService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

        // Start an infinite loop to wait for events
        while (true)
        {
            // Wait for events
            WatchKey key = watcherService.take();
            for (WatchEvent <?> event : key.pollEvents()) {

                // Process the event
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    System.out.println("File created: " + event.context().toString());
                } else if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                    System.out.println("File deleted: " + event.context().toString());
                } else if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                    System.out.println("File modified: " + event.context().toString());
                }
            }
            // Reset the key for future events
            key.reset();
        }
    }
}

