package com.aziz.tweet.service.service;

import com.aziz.tweet.service.entity.Tweet;

import java.util.List;

public interface TweetService {
  public List<Tweet> getAllTweets();

  public List<Tweet> getAllTweetsByUserId(Long userId);

//  public PostResponse createTweet(Long userId, TweetDto newTweet);

  public Tweet updateTweet(Long userId, Long id, Tweet updateTweet);
  public void deleteTweet(Long userId, Long tweetId);
}
