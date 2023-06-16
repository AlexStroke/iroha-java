//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int

/**
 * VersionedEventSubscriptionRequest
 *
 * Generated from 'iroha_data_model::events::VersionedEventSubscriptionRequest' enum
 */
public sealed class VersionedEventSubscriptionRequest : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'V1' variant
     */
    public data class V1(
        public val eventSubscriptionRequest: EventSubscriptionRequest
    ) : VersionedEventSubscriptionRequest() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<V1>, ScaleWriter<V1> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): V1 = try {
                V1(
                    EventSubscriptionRequest.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: V1) = try {
                EventSubscriptionRequest.write(writer, instance.eventSubscriptionRequest)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object :
        ScaleReader<VersionedEventSubscriptionRequest>,
        ScaleWriter<VersionedEventSubscriptionRequest> {
        public override fun read(reader: ScaleCodecReader): VersionedEventSubscriptionRequest = when (
            val
            discriminant = reader.readUByte()
        ) {
            1 -> V1.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(
            writer: ScaleCodecWriter,
            instance: VersionedEventSubscriptionRequest
        ) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                1 -> V1.write(writer, instance as V1)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}