/*
  Copyright 2012 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.scribe.up.profile.casoauthwrapper;

import org.scribe.up.profile.DefaultCommonProfile;
import org.scribe.up.profile.OAuthAttributesDefinition;
import org.scribe.up.profile.OAuthProfile;

/**
 * This class is the user profile for sites using OAuth wrapper for CAS.<br />
 * It is returned by the {@link org.scribe.up.provider.impl.CasOAuthWrapperProvider}.
 * <p />
 * <table border="1" cellspacing="2px">
 * <tr>
 * <th>Method :</th>
 * <th>From the JSON profile response :</th>
 * </tr>
 * <tr>
 * <th colspan="2">The attributes of the {@link org.scribe.up.profile.CommonProfile}</th>
 * </tr>
 * <tr>
 * <td>String getEmail()</td>
 * <td>the <i>email</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getFirstName()</td>
 * <td>the <i>first_name</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getFamilyName()</td>
 * <td>the <i>last_name</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getDisplayName()</td>
 * <td>the <i>display_name</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getUsername()</td>
 * <td>the <i>username</i> attribute</td>
 * </tr>
 * <tr>
 * <td>Gender getGender()</td>
 * <td>the <i>gender</i> attribute</td>
 * </tr>
 * <tr>
 * <td>Locale getLocale()</td>
 * <td>the <i>locale</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getPictureUrl()</td>
 * <td>the <i>picture_url</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getProfileUrl()</td>
 * <td>the <i>profile_url</i> attribute</td>
 * </tr>
 * <tr>
 * <td>String getLocation()</td>
 * <td>the <i>location</i> attribute</td>
 * </tr>
 * </table>
 * <p />
 * All other attributes must be retrieved using the {@link #getAttributes()} method.
 * 
 * @see org.scribe.up.provider.impl.CasOAuthWrapperProvider
 * @author Jerome Leleu
 * @since 1.3.0
 */
public class CasOAuthWrapperProfile extends DefaultCommonProfile implements OAuthProfile {
    
    private static final long serialVersionUID = -1337571645983554276L;
    
    public void setAccessToken(final String accessToken) {
        addAttribute(OAuthAttributesDefinition.ACCESS_TOKEN, accessToken);
    }
    
    public String getAccessToken() {
        return (String) this.attributes.get(OAuthAttributesDefinition.ACCESS_TOKEN);
    }
}