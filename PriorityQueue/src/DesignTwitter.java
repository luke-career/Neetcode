import java.util.*;

public class DesignTwitter {
    HashMap<Integer, ArrayList<int[]>> tweetMap;
HashMap<Integer, HashSet<Integer>> userMap;
int timeStamp;

public DesignTwitter () {
    tweetMap = new HashMap<>();
    userMap = new HashMap<>();

}

public void postTweet(int userId, int tweetId) {
    if (!userMap.containsKey(userId)) {
        userMap.put(userId, new HashSet<>());
        userMap.get(userId).add(userId);
    }
    if (!tweetMap.containsKey(userId)) {
        tweetMap.put(userId, new ArrayList<>());
    }
    // int timeStamp = tweetMap.get(userId).size();
    tweetMap.get(userId).add(new int[] { tweetId, timeStamp++ });
}

public List<Integer> getNewsFeed(int userId) {
    List<Integer> res = new ArrayList<>();
    PriorityQueue<int[]> Pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

    HashSet<Integer> followed = userMap.getOrDefault(userId, new HashSet<>());

    for (int user : followed) {
        ArrayList<int[]> list = tweetMap.getOrDefault(user,new ArrayList<>());
        for (int[] message : list) {
            Pq.offer(message);
        }
    }

    for (int i = 0; i < 10 && !Pq.isEmpty(); i++) {
        res.add(Pq.poll()[0]);
    }
    return res;
}

public void follow(int followerId, int followeeId) {
    if (!userMap.containsKey(followerId)) {
        userMap.put(followerId, new HashSet<>());
        userMap.get(followerId).add(followerId);
    }
    if (!userMap.containsKey(followerId)) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(followeeId);
        userMap.put(followerId, hs);
    } else {
        userMap.get(followerId).add(followeeId);
    }

}

public void unfollow(int followerId, int followeeId) {
    if (userMap.get(followerId).contains(followeeId)) {
        userMap.get(followerId).remove(followeeId);
    } else {
        return;
    }
}
}
