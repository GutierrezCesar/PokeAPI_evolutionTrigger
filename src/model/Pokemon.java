package model;

import java.util.List;

public record Pokemon(int id,
                      String name,
                      List<NameEntry> names) {
}
