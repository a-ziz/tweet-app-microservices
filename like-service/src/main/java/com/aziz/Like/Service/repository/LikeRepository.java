package com.aziz.Like.Service.repository;

import com.aziz.Like.Service.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long>
{
//    @Query("SELECT l from Like l where l.user.Id=user_Id AND l.tweet.Id=tweet_Id")
//    public Like isLikeExist(@Param("user_Id") Long user_Id, @Param("tweet_Id") Long tweet_Id);
//
//    @Query("SELECT l from Like l where l.tweet.Id = tweet_Id")
//    Optional<List<Like>>  findByTweetId(@Param("tweet_Id") Long tweet_Id);

}