package com.aziz.tweet.service.service.impl;

import com.aziz.tweet.service.entity.Tweet;
import com.aziz.tweet.service.repository.TweetRepository;
import com.aziz.tweet.service.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {
  @Autowired
  TweetRepository tweetRepository;
//  @Autowired
//  UserRepository userRepository;
  @Override
  public List<Tweet> getAllTweets() {
    return tweetRepository.findAll();
  }

//  @Override
//  public List<Tweet> getAllTweetsByUserId(Long userId)
//  {
//    return tweetRepository.findByUserId(userId);
//  }

//  @Override
//  public PostResponse createTweet(Long userId, TweetDto newTweet)
//  {
//    User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("Resource Not Found"));
//
//    Tweet tweet = new Tweet();
//    tweet.setUser(user);
//    tweet.setContent(newTweet.getContent());
//    tweet.setDate(newTweet.getDate());
//    Tweet savedTweet = tweetRepository.save(tweet);
//
//    PostResponse response = new PostResponse();
//    response.setTweet(savedTweet);
//    response.setMessage("Tweet posted.");
//    response.setError(false);
//    return response;
//  }
//
//  @Override
//  public Tweet updateTweet(Long userId, Long id, Tweet updateTweet)
//  {
//    User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("Resource Not Found"));
//    Tweet tweet = tweetRepository.findById(id).orElseThrow(()->new RuntimeException("Resource Not Found"));
//    if(user.getId() != tweet.getUser().getId())
//    {
//      throw new RuntimeException("Tweet does not belong to the User: " + userId);
//    }
//    tweet.setContent(updateTweet.getContent());
//    return tweetRepository.save(tweet);
//  }
//
//  @Override
//  public void deleteTweet(Long userId, Long tweetId)
//  {
//    User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("Resource Not Found"));
//    Tweet tweet = tweetRepository.findById(tweetId).orElseThrow(()->new RuntimeException("Resource Not Found"));
//    if(user.getId() != tweet.getUser().getId())
//    {
//      throw new RuntimeException("Tweet does not belong to the User: " + userId);
//    }
//
//    tweetRepository.delete(tweet);
//  }
}