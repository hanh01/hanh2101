using System;

namespace Snippet3
{
    class IntelliSenseDemo : TimeZone
    {
        public override string DaylightName
        {
            get
            {
                throw new Exception("The method or operation is not implemented.");
            }
        }
        public override System.Globalization.DaylightTime GetDaylightChanges(int year)
        {
            throw new Exception("The method or operation is not implemented.");
        }
        public override TimeSpan GetUtcOffset(DateTime time)
        {
            throw new Exception("The method or operation is not implemented.");
        }
        public override string StandardName
        {
            get
            {
                throw new Exception("The method or operation is not mplemented.");
            }
        }
    }
}
