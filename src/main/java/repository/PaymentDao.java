package repository;

import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDao {

    public static final String HASH_KEY = "Payment";

    @Autowired
    private RedisTemplate template;

    public Payment findProductById(long id_transaction){
        return (Payment) template.opsForHash().get(HASH_KEY,id_transaction);
    }
}
