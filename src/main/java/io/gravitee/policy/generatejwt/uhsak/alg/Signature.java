/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.policy.generatejwt.uhsak.alg;

import com.nimbusds.jose.JWSAlgorithm;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
public enum Signature {
    RSA_RS256(JWSAlgorithm.RS256),
    HMAC_HS256(JWSAlgorithm.HS256),
    HMAC_HS384(JWSAlgorithm.HS384),
    HMAC_HS512(JWSAlgorithm.HS512);

    private JWSAlgorithm alg;

    Signature(JWSAlgorithm alg) {
        this.alg = alg;
    }

    public JWSAlgorithm getAlg() {
        return alg;
    }
}
