package com.shine.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends ElasticsearchRepository<Item, Long> {
}
