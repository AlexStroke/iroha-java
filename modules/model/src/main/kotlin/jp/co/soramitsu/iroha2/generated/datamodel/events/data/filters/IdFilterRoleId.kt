//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events.`data`.filters

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.role.Id
import jp.co.soramitsu.iroha2.wrapException

/**
 * IdFilterRoleId
 *
 * Generated from 'iroha_data_model::events::data::filters::IdFilterRoleId' tuple structure
 */
public data class IdFilterRoleId(
    public val id: Id
) {
    public companion object : ScaleReader<IdFilterRoleId>, ScaleWriter<IdFilterRoleId> {
        public override fun read(reader: ScaleCodecReader): IdFilterRoleId = try {
            IdFilterRoleId(
                Id.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: IdFilterRoleId) = try {
            Id.write(writer, instance.id)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}