//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.expression

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Long

/**
 * RaiseTo
 *
 * Generated from 'iroha_data_model::expression::RaiseTo' regular structure
 */
public data class RaiseTo(
    public val left: EvaluatesTo<Long>,
    public val right: EvaluatesTo<Long>
) {
    public companion object : ScaleReader<RaiseTo>, ScaleWriter<RaiseTo> {
        public override fun read(reader: ScaleCodecReader): RaiseTo = try {
            RaiseTo(
                EvaluatesTo.read(reader) as EvaluatesTo<Long>,
                EvaluatesTo.read(reader) as EvaluatesTo<Long>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: RaiseTo) = try {
            EvaluatesTo.write(writer, instance.left)
            EvaluatesTo.write(writer, instance.right)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
