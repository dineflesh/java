package com.pubnub.api.models.consumer.objects_vsp.space;

import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class CreateSpaceResult extends SpaceResult {
    public CreateSpaceResult(final EntityEnvelope<Space> entityEnvelope) {
        super(entityEnvelope);
    }
}
