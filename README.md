# Jikan4j
— *The simplest (and crappiest) [Jikan](https://jikan.moe) wrapper, perhaps*

## Exemple

```java
Anime anime = new Anime("azur lane");

System.out.println(anime.getImage());
System.out.println(anime.getTitle());
System.out.println(anime.getSynopsis());
System.out.println(anime.isAiring());
System.out.println();
System.out.println(anime.getType().getType()); // anime#getType is still wip; it will eventually return values such as: TV, SHORT, OVA, etc.
System.out.println(anime.getRating());
System.out.println();
System.out.println(anime.getStartDate());
System.out.println(anime.getEndData());
System.out.println();
System.out.println(anime.getMalId());
System.out.println(anime.getMalMemberCount());
System.out.println(anime.getMalUrl());
System.out.println(anime.getMalScore());
System.out.println();
System.out.println(anime.getRequestHash());
System.out.println(anime.hasRequestCached());
System.out.println(anime.getRequestCacheExpiry());
```

Output:
```java
https://cdn.myanimelist.net/images/anime/1106/111620.jpg?s=a77f1b346a14ccdc7fc4e5a366c5ad02
Azur Lane
When the "Sirens," an alien force with an arsenal far surpassing the limits of current technology, suddenly appeared, a divided humanity stood in complete solidarity for the first time. Four countries...
false

Soon..
PG-13

2019-10-03T00:00:00+00:00
2020-03-20T00:00:00+00:00

38328
130909
https://myanimelist.net/anime/38328/Azur_Lane
6.28

request:search:bacb59d1e7f1f9d9581e1d9a1e877712d6f7f6fd
true
432000
```

## Requirements
- Java 11 or higher
- An internet connection