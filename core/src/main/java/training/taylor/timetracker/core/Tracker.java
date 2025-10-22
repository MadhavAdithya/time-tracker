package training.taylor.timetracker.core;

import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Tracker {

    private final List<TimeEntry> entries = new ArrayList<>();

    public void add(TimeEntry entry) {
        if (entry == null) {
            throw new IllegalArgumentException("entry must not be null");
        }
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        return entries.get(index);
    }

    public List<TimeEntry> getAll() {
        return Collections.unmodifiableList(entries);
    }
}
