package com.github.mkorman9

import io.smallrye.common.annotation.RunOnVirtualThread
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(value = [])
@RunOnVirtualThread
class StubResource {
    @GET
    fun getStub() = "stub"
}
