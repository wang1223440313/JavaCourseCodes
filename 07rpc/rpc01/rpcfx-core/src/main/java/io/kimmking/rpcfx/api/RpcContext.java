package io.kimmking.rpcfx.api;

import io.kimmking.rpcfx.meta.ProviderMeta;
import lombok.Getter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Description for this class.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/1/13 20:34
 */
public class RpcContext {

    @Getter
    private MultiValueMap<String, ProviderMeta> providerHolder = new LinkedMultiValueMap<>();

    @Getter
    private Map<String, Object> consumerHolder = new HashMap<>();

}
